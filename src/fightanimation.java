public class fightanimation {
    private String heroName;
    private String location;

    public String getName() { return heroName; }
    public String getLocation() { return location; }

    public void IdleAnimation (Hero hero, Enemy enemy, String heroName, String location) {
        DisplayFight display = new DisplayFight();

        switch (heroName) {
            case "Knight":
                System.out.println("(No animation defined for Knight yet)");
                break;
            case "Assassin":
                System.out.println("(No animation defined for Assassin yet)");
                break;
            case "Wizard":
                if(enemy.isAlive()) {
                    if(location.equals("Surtur's Fiery Chamber") || (location.contains("Surtur") && location.contains("Fiery Chamber"))) {
                        display.DisplayWizardvsDragon();
                    } else if(location.equals("Whispering Passage")) {
                        display.DisplayWizardvsWhiteBeast();
                    } else if(location.equals("Throne of the Chasm")) {
                        display.DisplayWizardvsUndeadKing();
                    }
                }
                break;
            default:
                System.out.println("Unknown Hero: " + hero);
                break;
        }
    }


    public void FightAnimation (Hero hero, Enemy enemy, String heroName, String location, String choice) {
        DisplayFight display = new DisplayFight();

        switch (heroName) {
            case "Knight":
                System.out.println("(No fight animation defined for Knight yet)");
                break;
            case "Assassin":
                System.out.println("(No fight animation defined for Assassin yet)");
                break;
            case "Wizard":
                if(location.equals("Surtur's Fiery Chamber") || (location.contains("Surtur") && location.contains("Fiery Chamber"))) {
                    if(choice.equals("1")) { // Attack
                        display.DisplayWizardAttackDragon();
                    } else if(choice.equals("2")) { // Defend
                        display.DisplayWizardDefendDragon();
                    } else if(choice.equals("3")) { // Special - healing
                        display.DisplayWizardSpecialDragon();
                    } else {
                        // Invalid input - enemy attacks
                        display.DisplayDragonAttackWizard();
                    }
                } else if(location.equals("Whispering Passage")) {
                    if(choice.equals("1")) { // Attack
                        display.DisplayWizardAttackWhiteBeast();
                    } else if(choice.equals("2")) { // Defend
                        display.DisplayWizardDefendWhiteBeast();
                    } else if(choice.equals("3")) { // Special - healing
                        display.DisplayWizardSpecialWhiteBeast();
                    } else {
                        // Invalid input - enemy attacks
                        display.DisplayWhiteBeastAttackWizard();
                    }
                } else if(location.equals("Throne of the Chasm")) {
                    if(choice.equals("1")) { // Attack
                        display.DisplayWizardAttackUndeadKing();
                    } else if(choice.equals("2")) { // Defend
                        display.DisplayWizardDefendUndeadKing();
                    } else if(choice.equals("3")) { // Special - healing
                        display.DisplayWizardSpecialUndeadKing();
                    } else {
                        // Invalid input - enemy attacks
                        display.DisplayUndeadKingAttackWizard();
                    }
                }
                break;
            default:
                System.out.println("Unknown Hero: " + heroName);
                break;
        }
    }

    public void EnemyAttackAnimation (Hero hero, Enemy enemy, String heroName, String location) {
        DisplayFight display = new DisplayFight();

        switch (heroName) {
            case "Knight":
                System.out.println("(No enemy attack animation defined for Knight yet)");
                break;
            case "Assassin":
                System.out.println("(No enemy attack animation defined for Assassin yet)");
                break;
            case "Wizard":
                if(location.equals("Surtur's Fiery Chamber") || (location.contains("Surtur") && location.contains("Fiery Chamber"))) {
                    display.DisplayDragonAttackWizard();
                } else if(location.equals("Whispering Passage")) {
                    display.DisplayWhiteBeastAttackWizard();
                } else if(location.equals("Throne of the Chasm")) {
                    display.DisplayUndeadKingAttackWizard();
                }
                break;
            default:
                break;
        }
    }
}