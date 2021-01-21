package com.lawshiga.passbyvalue;
/*The first parameter in the above example is the warriorProfession variable,
which is a mutable object. The second parameter, weapon, is an immutable String:
Now let’s analyze what is happening inside this method.
At the first line of this method, we append the Knight value to the warriorProfession variable.
Remember that warriorProfession is a mutable object;
therefore the real object will be changed, and the value from it will be “Dragon Knight.”
In the second instruction, the immutable local String variable will be changed to “Dragon Sword.”
The real object will never be changed, however, since String is immutable and its attributes are final:
Finally, we pass null to the variables here, but not to the objects.
The objects will remain the same as long as they are still accessible
externally--in this case through the main method. And, although the local variables will be null,
nothing will happen to the objects:*/

public class ReferenceChallenger {
    public static void main(String... doYourBest) {
        StringBuilder warriorProfession = new StringBuilder("Dragon ");
        String warriorWeapon = "Sword ";
        changeWarriorClass(warriorProfession, warriorWeapon);

        System.out.println("Warrior=" + warriorProfession + " Weapon=" + warriorWeapon);
    }

    static void changeWarriorClass(StringBuilder warriorProfession, String weapon) {
        warriorProfession.append("Knight");
        weapon = "Dragon " + weapon;

        weapon = null;
        warriorProfession = null;
    }
}
