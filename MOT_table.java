import java.util.HashMap;


public class MOT_table {
    HashMap<String,Integer> AD,IS,DL,CC,RG;
    public MOT_table(){
        AD = new HashMap<>();
        IS = new HashMap<>();
        DL = new HashMap<>();
        CC = new HashMap<>();
        RG = new HashMap<>();

        DL.put("DC", 01);
        DL.put("DS", 02);
        IS.put("STOP", 00);
        IS.put("ADD", 01);
        IS.put("SUB",2);
		IS.put("MULT",3);
		IS.put("MOVER",4);
		IS.put("MOVEM",5);
		IS.put("COMP",6);
		IS.put("BC",7);
		IS.put("DIV",8);
		IS.put("READ",9);
		IS.put("PRINT",10);
		CC.put("LT",1);
		CC.put("LE",2);
		CC.put("EQ",3);
		CC.put("GT",4);
		CC.put("GE",5);
		CC.put("ANY",6);
		AD.put("START",1);
		AD.put("END",2);
		AD.put("ORIGIN",3);
		AD.put("EQU",4);
		AD.put("LTORG",5);
		RG.put("AREG",1);
		RG.put("BREG",2);
		RG.put("CREG",3);
		RG.put("DREG",4);
    }
    // Get function to get the type of instruction from HashMaps
    public String getType(String s){
        s=s.toUpperCase();
        if(AD.containsKey(s)){
            return "AD";
        }
        else if(IS.containsKey(s)){
            return "IS";
        }
        else if(RG.containsKey(s)){
            return "RG";
        }  
        else if (CC.containsKey(s)){
            return "CC";
        }else if(DL.containsKey(s)){
            return "DL";
        }
        return "";
    }
    // Function to get Machine coded value of Instr provided
    public int getValue(String s){
        s=s.toUpperCase();
        
        if(AD.containsKey(s)){
            return AD.get(s);
        }
        else if(IS.containsKey(s)){
            return IS.get(s);
        }
        else if(CC.containsKey(s)){
            return CC.get(s);
        }
        else if(RG.containsKey(s)){
            return RG.get(s);
        }
        else if(DL.containsKey(s)){
            return DL.get(s);
        }
        return -1;
    }
    public void printAll(){
        System.out.println(AD.toString());
        System.out.println(IS.toString());
        System.out.println(DL.toString());
        System.out.println(RG.toString());
        System.out.println(CC.toString());
    }

    public static void main(String[] args) {
        MOT_table mot = new MOT_table();
        mot.printAll();
    }

}


