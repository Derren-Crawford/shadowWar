package shadowwararmaggeddon;


public class Armour {
    
    private String armourName;
    private int armourSave;
    private int pointsCost;
    private String specialNotes;
    

    public Armour(String armourName) 
    {
        this.armourName = armourName;
        this.armourSave = armourSaveSetter(armourName);
        this.pointsCost = pointsCostSetter(armourName);
        this.specialNotes = specialNotesSetter(armourName);
    }
    
    private int armourSaveSetter(String armourName)
    {
        if (armourName.equals("Carapace Armour") || armourName.equals("'Eavy Armour") || armourName.equals("Scout Armour"))
        {
            return 4;
        }
        else if (armourName.equals("Flak Armour") || armourName.equals("Squig-Hide Armour"))
        {
            return 6;
        }
        else if (armourName.equals("Power Armour") || armourName.equals("Terminator Armour"))
        {
            return 3;
        }
        
        //This line is here to catch an error//
        return 999;
        
    }
    
    private int pointsCostSetter(String armourName)
    {
        if (armourName.equals("Carapace Armour"))
        {
            return 20;
        }
        else if (armourName.equals("'Eavy Armour"))
        {
            return 25;
        }
        
        return 0;
    }
    
    private String specialNotesSetter(String armmourName)
    {
        if (armourName.equals("Carapace Armour"))
        {
            return "-1 Initiative";
        }
        else if (armourName.equals("Flak Armour"))
        {
            return "5+ vs template weapons";
        }
        else if (armourName.equals("Terminator Armour"))
        {
            return "Armour save is taken on 2D6, 5+ invulnerable save, can not be pinned by shooting attacks unless they are from high impact weapons";
        }
        
        return "n/a";
    }
    

}
