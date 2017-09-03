package guru.springframework.repositories;

/**
 * @author Nikolay Horushko
 */
public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}
