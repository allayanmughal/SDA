import java.util.*;
import java.util.stream.Collectors;

// Enums for Genre and Mood
enum Genre {
    POP, ROCK, CLASSICAL, JAZZ, KPOP, LATIN, INDIE, SYNTHWAVE, AMBIENT, AFROBEAT;
}

enum Mood {
    HAPPY, ENERGETIC, CHILL, FOCUS;
}

// User class to store user information and their listening history
class User {
    String userId;
    int age;
    String region;
    List<Genre> favoriteGenres;
    Map<Mood, Integer> moodPreferences;  // Count of each mood played by the user

    public User(String userId, int age, String region) {
        this.userId = userId;
        this.age = age;
        this.region = region;
        this.favoriteGenres = new ArrayList<>();
        this.moodPreferences = new HashMap<>();
    }

    public void addFavoriteGenre(Genre genre) {
        favoriteGenres.add(genre);
    }

    public void addMoodPreference(Mood mood) {
        moodPreferences.put(mood, moodPreferences.getOrDefault(mood, 0) + 1);
    }
}

// Music Insights System class
class MusicInsightsSystem {
    List<User> users;
    Map<Genre, Integer> genreTrends;
    Map<Mood, Integer> moodTrends;

    public MusicInsightsSystem() {
        users = new ArrayList<>();
        genreTrends = new HashMap<>();
        moodTrends = new HashMap<>();
    }

    // Register a new user
    public void registerUser(User user) {
        users.add(user);
    }

    // Track genre trends
    public void updateGenreTrend(Genre genre) {
        genreTrends.put(genre, genreTrends.getOrDefault(genre, 0) + 1);
    }

    // Track mood trends
    public void updateMoodTrend(Mood mood) {
        moodTrends.put(mood, moodTrends.getOrDefault(mood, 0) + 1);
    }

    // Analyze demographic trends (returning most popular genre by region)
    public Map<String, Genre> analyzeDemographicTrends() {
        Map<String, Genre> popularGenresByRegion = new HashMap<>();
        Map<String, Map<Genre, Integer>> genreCountByRegion = new HashMap<>();

        for (User user : users) {
            genreCountByRegion.putIfAbsent(user.region, new HashMap<>());
            for (Genre genre : user.favoriteGenres) {
                genreCountByRegion.get(user.region).put(genre, genreCountByRegion.get(user.region).getOrDefault(genre, 0) + 1);
            }
        }

        for (String region : genreCountByRegion.keySet()) {
            Optional<Map.Entry<Genre, Integer>> mostPopularGenre = genreCountByRegion.get(region)
                    .entrySet().stream()
                    .max(Map.Entry.comparingByValue());
            mostPopularGenre.ifPresent(entry -> popularGenresByRegion.put(region, entry.getKey()));
        }

        return popularGenresByRegion;
    }

    // Provide mood-based recommendations
    public List<Genre> recommendBasedOnMood(User user, Mood mood) {
        List<Genre> recommendedGenres = new ArrayList<>();

        // Recommend genres that are trending
        genreTrends.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))  // Sort by popularity
                .limit(3)  // Top 3 recommendations
                .forEach(entry -> recommendedGenres.add(entry.getKey()));

        return recommendedGenres;
    }

    // Generate yearly music insights for users
    public void generateUserYearlyInsights(User user) {
        System.out.println("Year in Music Summary for User: " + user.userId);
        System.out.println("Top Genres: " + user.favoriteGenres);
        System.out.println("Mood Preferences: " + user.moodPreferences);
    }
}

// Main Class to demonstrate the functionality
public class MelodyAI {
    public static void main(String[] args) {
        MusicInsightsSystem musicInsightsSystem = new MusicInsightsSystem();

        // Sample Users
        User user1 = new User("user123", 22, "US");
        user1.addFavoriteGenre(Genre.INDIE);
        user1.addFavoriteGenre(Genre.ROCK);
        user1.addMoodPreference(Mood.HAPPY);
        user1.addMoodPreference(Mood.CHILL);

        User user2 = new User("user456", 28, "UK");
        user2.addFavoriteGenre(Genre.KPOP);
        user2.addFavoriteGenre(Genre.POP);
        user2.addMoodPreference(Mood.ENERGETIC);

        // Register Users in the System
        musicInsightsSystem.registerUser(user1);
        musicInsightsSystem.registerUser(user2);

        // Update Trends based on listening data
        musicInsightsSystem.updateGenreTrend(Genre.KPOP);
        musicInsightsSystem.updateGenreTrend(Genre.ROCK);
        musicInsightsSystem.updateMoodTrend(Mood.HAPPY);

        // Analyze Demographic Trends
        Map<String, Genre> demographicTrends = musicInsightsSystem.analyzeDemographicTrends();
        System.out.println("Popular Genres by Region: " + demographicTrends);

        // Provide Mood-based Recommendations
        List<Genre> moodRecommendations = musicInsightsSystem.recommendBasedOnMood(user1, Mood.HAPPY);
        System.out.println("Mood-Based Recommendations for " + user1.userId + ": " + moodRecommendations);

        // Generate Yearly Insights for a User
        musicInsightsSystem.generateUserYearlyInsights(user1);
    }
}
