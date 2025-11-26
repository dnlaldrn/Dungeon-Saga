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
                switch(location) {
                    case "Surtur’s Fiery Chamber": 
                        if(enemy.isAlive() == true && enemy.getHp() == enemy.getMaxHp()) {
                            display.DisplayWizardvsDragon();
                        }
                        break;
                    default:
                        break;
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
                switch(location) {
                    case "Surtur’s Fiery Chamber":
                        if(choice.equals("1")) { // Attack
                            display.DisplayWizardAttackDragon();
                        } else if(choice.equals("2")) { // Defend
                            display.DisplayWizardDefendDragon();
                        } else if(choice.equals("3")) { // Special
                            break;
                        } else {
                            display.DisplayDragonAttackWizard();
                        }
                        break;
                    default:
                        break;
                }
                break;
            default:
                System.out.println("Unknown Hero: " + heroName);
                break;
        }
    }
}