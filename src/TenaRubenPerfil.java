import java.util.List;

public class TenaRubenPerfil {
    private String name;
    private String story;
    private List<String> hobbies;
    private List<String> foods;
    private List<String> funFacts;

    public TenaRubenPerfil(String name, String story, List<String> hobbies, List<String> foods, List<String> funFacts) {
        this.name = name;
        this.story = story;
        this.hobbies = hobbies;
        this.foods = foods;
        this.funFacts = funFacts;
    }

    public String getName() {
        return name;
    }

    public String getStory() {
        return story;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public List<String> getFoods() {
        return foods;
    }

    public List<String> getFunFacts() {
        return funFacts;
    }

    public String showStory() {
        return "My Story: " + story;
    }

    public String showFavorites() {
        StringBuilder favorites = new StringBuilder("Favorites:\nHobbies:\n");
        for (String hobby : hobbies) {
            favorites.append(" - ").append(hobby).append("\n");
        }
        favorites.append("Foods:\n");
        for (String food : foods) {
            favorites.append(" - ").append(food).append("\n");
        }
        return favorites.toString();
    }

    public String showFunFact() {
        int index = (int) (Math.random() * funFacts.size());
        return "Fun Fact: " + funFacts.get(index);
    }
}