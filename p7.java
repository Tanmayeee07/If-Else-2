class gemo{
        public static void main(String[] args){
                int cp = 1000;
		int sp = 1200;
                if (cp<sp)
                       System.out.println(" profit of "+(sp-cp));
		else if (cp==sp)
			System.out.println("No profit no loss");

                else
			System.out.println("Lose of "+(cp-sp));

        }
}
