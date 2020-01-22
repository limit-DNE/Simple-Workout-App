package limit.dne.simpleworkoutapp;

public class Workouts {

    private String name;
    private String description;

    private Workouts(String name, String description){
        this.name = name;
        this.description = description;
    }

    public static final Workouts[] workouts = { new Workouts("The Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workouts("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workouts("The Wimp Special", "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workouts("Strength and Length", "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups"),
            new Workouts("Leg Strength", "30 Squats\n15 x 3 Leg Press\n12 x 3 Deadlifts\n7 x 3 (1 min) Wall-Sits\n15 x 3 Leg Curls"),
            new Workouts("Pectorals", "15 x 3 Bench Press\n12 x 2 Chest Fly\n12 x 2 Bent Over Row\n15 x 3 Pulldowns"),
            new Workouts("Shoulder Strength and Length", "15 x 3 Shoulder Press\n12 x 2 Military Press\n12 x 2 Shoulder Fly"),
            new Workouts("Biceps and Triceps", "8 x 3 Pushdowns\n12 x 2 Tricep Extensions\n12 x 2 Barbell Curve\n8 x 2 Preacher Curls"),
            new Workouts("Abdominals and Obliques", "15 x 3 Cruch\n15 x 3 Russian Twists\n15 x 3 Leg Raises\n15 x 3 Weighted Sit-Ups"),
            new Workouts("Fullbody", "20 x 2 Inchworms\n20 x 2 Tuck Jumps\n20 x 2 Mountain Climbers\n12 x 2 Plyometric Push-Ups"),
            new Workouts("Leg Length and Support", "15 x 3 Weighted Lunge\n12 x 2 Clock-Lunge\n10 x 2 Pistol Squats"),
            new Workouts("Chest Length and Support", "12 x 2 Contralateral Limb Raise\n12 x 2 Handstand Push-Ups\n12 x 2 Reverse Fly"),
            new Workouts("Shoulder-Arm Lenght and Support", "12 x 2 Diamond Push-Ups\n20 x 2 Arm Circles\n1 Round of Shoulder Stabilization Series(IYTWO)"),
            new Workouts("Core Strength and Support", "12 x 2 L-Seat\n12 x 3 Rotational Push-Ups\n12 x 2 Flutter Kicks\n12 x 2 Dynamic Prone Planks")
    };

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return this.name;
    }
}
