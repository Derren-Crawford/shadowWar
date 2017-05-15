

package shadowwararmaggeddon;


public class RangedWeapon {
    
    private String weaponName;
    private int shortRangeMin;
    private int shortRangeMax;
    private int longRangeMin;
    private int longRangeMax;
    private int toHitModifierShortRange;
    private int toHitModifierLongRange;
    private int strength;
    private int damage;
    private int armourSaveModifier;
    private int ammoRoll;

    public RangedWeapon(String[] rangedWeaponStatsFromText) 
    {
        weaponName = rangedWeaponStatsFromText[0];
        shortRangeMin = Integer.parseInt(rangedWeaponStatsFromText[1]);
        shortRangeMax = Integer.parseInt(rangedWeaponStatsFromText[2]);
        longRangeMin = Integer.parseInt(rangedWeaponStatsFromText[3]);
        longRangeMax = Integer.parseInt(rangedWeaponStatsFromText[4]);
        toHitModifierShortRange = Integer.parseInt(rangedWeaponStatsFromText[5]);
        toHitModifierLongRange = Integer.parseInt(rangedWeaponStatsFromText[6]);
        strength = Integer.parseInt(rangedWeaponStatsFromText[7]);
        damage = Integer.parseInt(rangedWeaponStatsFromText[8]);
        armourSaveModifier = Integer.parseInt(rangedWeaponStatsFromText[9]);
        ammoRoll = Integer.parseInt(rangedWeaponStatsFromText[10]);
    }
    
    //Getter Methods//

    public String getWeaponName() {
        return weaponName;
    }

    public int getShortRangeMin() {
        return shortRangeMin;
    }

    public int getShortRangeMax() {
        return shortRangeMax;
    }

    public int getLongRangeMin() {
        return longRangeMin;
    }

    public int getLongRangeMax() {
        return longRangeMax;
    }

    public int getToHitModifierShortRange() {
        return toHitModifierShortRange;
    }

    public int getToHitModifierLongRange() {
        return toHitModifierLongRange;
    }
    
    public int getStrength() {
        return strength;
    }

    public int getDamage() {
        return damage;
    }

    public int getArmourSaveModifier() {
        return armourSaveModifier;
    }

    public int getAmmoRoll() {
        return ammoRoll;
    }
    
    //End of Getter Methods//
    
    public void printStats()
    {
        System.out.println("Name: " + weaponName);
        System.out.println("Short Range: " + shortRangeMin + "-" + shortRangeMax);
        System.out.println("Long Range: " + longRangeMin + "-" + longRangeMax);
        if (toHitModifierShortRange > 0)
        {
            System.out.println("Short Range Hit Modifier: " + "+" + toHitModifierShortRange);
        }
        else if (toHitModifierShortRange == 0)
        {
            System.out.println("Short Range Hit Modifier: -");
        }
        else
        {
            System.out.println("Short Range Hit Modifier: " + "-" + toHitModifierShortRange);
        }
        if (toHitModifierLongRange > 0)
        {
            System.out.println("Long Range Hit Modifier: " + "+" + toHitModifierLongRange);
        }
        else if (toHitModifierLongRange == 0)
        {
            System.out.println("Long Range Hit Modifier: -");
        }
        else
        {
            System.out.println("Long Range Hit Modifier: " + toHitModifierLongRange);
        }
        System.out.println("Strength: " + strength);
        System.out.println("Damage: " + damage);
        if (armourSaveModifier == 0)
        {
            System.out.println("Save Modifier: -");
        }
        else
        {
            System.out.println("Save Modifier: " + armourSaveModifier);
        }
        System.out.println("Ammo Roll: " + ammoRoll + "+");
    }
    
    

}
