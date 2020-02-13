class Test
{
    static void ReserveName(String name) throws MahimaException
    {
        if(name == "mahima")
        {
            throw new MahimaException("NameIsReserved");
        }else{
            System.out.println("You can use this name.");
        }
    }

    public static void main(String[] args) {
        try {
           ReserveName("mahima");
        } 
        catch (MahimaException e) {
            System.out.println("You cannot reserve this name. " + e);
        }
    }
    
}