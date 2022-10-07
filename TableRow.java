public class TableRow {
    
    String symbol;
    int index,address;

    // These are the constructors 
    // Constructor to accept obj call WITHOUT INDEX VALUE 
    public TableRow(String symbol,int address){
        this.symbol = symbol;
        this.address = address;
        this.index = 0;
    }
    // Const call to accept obj call with all three
    public TableRow(String symbol,int address,int index){
        this.symbol = symbol;
        this.address = address;
        this.index = index;
    }

    // getters
    public String getSymbol(){
        return symbol;
    }
    public int getAddress(){
        return address;
    }
    public int getindex(){
        return index;
    }
    // setters

    public void setAddress(int s ){
        this.address = s;
    }
    public void setIndex(int s ){
        this.index = s;
    }
    public void setSymbol(String s ){
        this.symbol = s;
    }

}
