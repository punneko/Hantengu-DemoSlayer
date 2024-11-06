public class Hantengu {

    protected String appearance;
    protected String fightStyle;
    protected String etched;
    protected String name;

    // Constructor for initializing name, appearance, etc.
    public Hantengu(String name) {
        this.name = name;
    }

    // Choosen method to set attributes based on a number
    public void choose(int num) {
        switch (num) {
            case 0:
                etched = "fear";
                appearance = "frail man with a very thin and skeletal body and red eyes with golden irises";
                fightStyle = "Emotion Manifestation";
                break;
            case 1:
                etched = "anger";
                appearance = "long wavy hair that goes past his shoulders and narrow, deep red eyes";
                fightStyle = "Electricity Generation";
                break;
            case 2:
                etched = "pleasure";
                appearance = "shoulder-length hair and narrow, deep green eyes";
                fightStyle = "Wind Blasts";
                break;
            case 3:
                etched = "sorrow";
                appearance = "shoulder-length hair and narrow, deep blue eyes";
                fightStyle = "Spear Projection";
                break;
            case 4:
                etched = "joy";
                appearance = "long wavy hair that goes past his shoulders and narrow gold eyes";
                fightStyle = "Sonic Scream";
                break;
            case 5:
                etched = "hatred";
                appearance = "short black hair that spikes up at various angles around his head and narrow gold eyes";
                fightStyle = "Wood Manipulation";
                break;
            case 6:
                etched = "resentment";
                appearance = "identical in appearance to Hantengu, except much bigger";
                fightStyle = "Ability Combination";
                break;
            default:
                etched = "unknown";
                appearance = "unknown";
                fightStyle = "unknown";
                break;
        }
    }

    // Method to get the name of the character (to be overridden in subclasses)
    public String getName() {
        return name;
    }

    // Methods to get appearance, etched, and fight style
    public String toAppearance() {
        return "Appearance: " + appearance;
    }

    public String toEtched() {
        return "Etched: " + etched;
    }

    public String toFightStyle() {
        return "Fight Style: " + fightStyle;
    }
}

// Subclasses for specific Hantengu forms
class Sekido extends Hantengu {
    public Sekido() {
        super("Sekido");
    }

    @Override
    public String getName() {
        return "Sekido";
    }
}

class Karaku extends Hantengu {
    public Karaku() {
        super("Karaku");
    }

    @Override
    public String getName() {
        return "Karaku";
    }
}

class Aizetsu extends Hantengu {
    public Aizetsu() {
        super("Aizetsu");
    }

    @Override
    public String getName() {
        return "Aizetsu";
    }
}

class Urogi extends Hantengu {
    public Urogi() {
        super("Urogi");
    }

    @Override
    public String getName() {
        return "Urogi";
    }
}

class Zohakuten extends Hantengu {
    public Zohakuten() {
        super("Zohakuten");
    }

    @Override
    public String getName() {
        return "Zohakuten";
    }
}

class Urami extends Hantengu {
    public Urami() {
        super("Urami");
    }

    @Override
    public String getName() {
        return "Urami";
    }
}

// Demo class to test the functionality
public class DemoSlayer {
    public static void main(String[] args) {
        Hantengu[] hantenguForms = new Hantengu[7];
        
        // Create instances of Hantengu forms and choose attributes
        hantenguForms[0] = new Hantengu("Hantengu");
        hantenguForms[0].choose(0);
        
        hantenguForms[1] = new Sekido();
        hantenguForms[1].choose(1);
        
        hantenguForms[2] = new Karaku();
        hantenguForms[2].choose(2);
        
        hantenguForms[3] = new Aizetsu();
        hantenguForms[3].choose(3);
        
        hantenguForms[4] = new Urogi();
        hantenguForms[4].choose(4);
        
        hantenguForms[5] = new Zohakuten();
        hantenguForms[5].choose(5);
        
        hantenguForms[6] = new Urami();
        hantenguForms[6].choose(6);
        
        // Output information for each form
        for (Hantengu form : hantenguForms) {
            System.out.println(form.getName());
            System.out.println(form.toAppearance());
            System.out.println(form.toEtched());
            System.out.println(form.toFightStyle());
            System.out.println(); 
        }
    }
}
