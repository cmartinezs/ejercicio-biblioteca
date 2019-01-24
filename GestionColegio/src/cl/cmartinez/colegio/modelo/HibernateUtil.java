package cl.cmartinez.colegio.modelo;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import cl.cmartinez.colegio.modelo.entidades.Categoria;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author carlos
 */
public class HibernateUtil 
{
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
       if (sessionFactory == null) {
          try {

             // Create registry builder
             StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

             // Hibernate settings equivalent to hibernate.cfg.xml's properties
             Map<String, String> settings = new HashMap();
             settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
             settings.put(Environment.URL, "jdbc:mysql://localhost/ventas?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=America/Santiago");
             settings.put(Environment.USER, "root");
             settings.put(Environment.PASS, "");
             settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
             settings.put(Environment.SHOW_SQL, "true");

             // Apply settings
             registryBuilder.applySettings(settings);

             // Create registry
             registry = registryBuilder.build();

             // Create MetadataSources
             MetadataSources sources = new MetadataSources(registry);
             sources.addAnnotatedClass(Categoria.class);
             
             // Create Metadata
             Metadata metadata = sources.getMetadataBuilder().build();

             // Create SessionFactory
             sessionFactory = metadata.getSessionFactoryBuilder().build();

          } catch (Exception e) {
             e.printStackTrace();
             if (registry != null) {
                StandardServiceRegistryBuilder.destroy(registry);
             }
          }
       }
       return sessionFactory;
    }

    public static void shutdown() {
       if (registry != null) {
          StandardServiceRegistryBuilder.destroy(registry);
       }
    }
}