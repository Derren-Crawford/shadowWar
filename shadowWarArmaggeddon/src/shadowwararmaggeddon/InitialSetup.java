package shadowwararmaggeddon;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class InitialSetup {
    
    private HashMap<String,RangedWeapon> rangedWeapons;
    
    public InitialSetup()
    {
        this.loadRangedWeapons();
    }
    
    
    private void loadRangedWeapons()
        {
            rangedWeapons = new HashMap<>();
            String file_name = "C:\\Users\\Nicola\\Documents\\NetBeansProjects\\shadowWarArmaggeddon\\src\\shadowwararmaggeddon\\data\\RangedWeapons.txt";

            try
            {
                ReadFile file = new ReadFile(file_name);
                String[] inputArray = file.openFile();
                
                for (String input : inputArray)
                {
                    String[] outputs = new String[11];

                    int characterPosition = 0;
                    int outputPosition = 0;
                    String outputString = "";

                    while (true)
                    {

                        if (input.charAt(characterPosition) == '.')
                        {
                            outputs[outputPosition] = outputString;
                            outputPosition++;
                            characterPosition++;
                            outputString = "";
                        }
                        else if (input.charAt(characterPosition) == ',')
                        {
                            outputs[outputPosition] = outputString;
                            break;
                        }
                        else if(input.charAt(characterPosition) != ',' && input.charAt(characterPosition) != '.')
                        {
                            outputString = outputString + input.charAt(characterPosition);
                            characterPosition++;
                        }
                    }
                    
                    rangedWeapons.put(outputs[0], new RangedWeapon(outputs));
                }
                
                


            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
    
    public void printAllWeapons()
    {
        for (Map.Entry<String, RangedWeapon> rangedWeapon : rangedWeapons.entrySet())
        {
            RangedWeapon weapon = rangedWeapon.getValue();
            weapon.printStats();
            System.out.println("");
        }
    }

}
