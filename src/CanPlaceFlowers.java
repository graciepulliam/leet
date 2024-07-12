public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean spaceBefore = true;
        int empty =  0;
        int plantedFlowers = 0;


        // if(flowerbed[0] == empty){
        //     spaceBefore = true;
        // }else{
        //     spaceBefore = false;
        // }

        for(int plot = 0; plot < flowerbed.length; plot++){

           
            int currentPlot = flowerbed[plot];
            int nextPlot;
            if(plot == flowerbed.length -1){
                nextPlot = empty;
            }
            else{
                nextPlot = flowerbed[plot+1];
            }

            // System.out.println("space at plot " + plot + " is " + currentPlot);
            // System.out.println("space before is " + spaceBefore);
            // System.out.println("space after is " + nextPlot);
            

            if(currentPlot != empty){
                
                spaceBefore = false;
                continue;
            }
            

            

            if(spaceBefore == true && nextPlot == empty){

                plantedFlowers++;
                //System.out.println("planting flower...");
                spaceBefore = false;
                continue;
            }

            spaceBefore = true;

        }

        if(plantedFlowers >= n){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args){
        int[] flowerbed1 = {1,0,0,0,1};
        int n1 =1;
        int[] flowerbed2 = {0,0,0,0,1};
        int n2 =2;

        System.out.println(canPlaceFlowers(flowerbed1, n1));
        System.out.println(canPlaceFlowers(flowerbed1, n2));
        System.out.println(canPlaceFlowers(flowerbed2, n2));

    }
}
