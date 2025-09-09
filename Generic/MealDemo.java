package Generic;

// Interface
interface MealPlan {
    void showMeal();
}

// Subtypes
class VegetarianMeal implements MealPlan {
    public void showMeal() { System.out.println("Vegetarian Meal"); }
}
class VeganMeal implements MealPlan {
    public void showMeal() { System.out.println("Vegan Meal"); }
}
class KetoMeal implements MealPlan {
    public void showMeal() { System.out.println("Keto Meal"); }
}

// Generic Class
class Meal<T extends MealPlan> {
    private T meal;
    Meal(T meal) { this.meal = meal; }
    public T getMeal() { return meal; }
}

// Generic Method
class MealPlanGenerator {
    public static <T extends MealPlan> void generateMeal(Meal<T> meal) {
        System.out.print("Generated Plan: ");
        meal.getMeal().showMeal();
    }
}

public class MealDemo {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());

        MealPlanGenerator.generateMeal(vegMeal);
        MealPlanGenerator.generateMeal(veganMeal);
    }
}

