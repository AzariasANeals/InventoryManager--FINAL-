import java.util.Arrays;
/**
 * Write a description of class InventoryManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InventoryManager
{
    
    /**
     *   [4,0,1,3,0,2,5,0]
     *   
     *   zeros = 3
     *   length = 8
     *   i = 7
     *   newPos = i + zeros = 7 + 3 = 10
     *   
     *   
     */
    
    public static void duplicateZeroes(int[] inventory){
        int zeros = 0;
        int length = inventory.length;
        
        for(int n : inventory){
            if (n == 0) zeros++;
        }
        
        for(int i = length - 1; i >=0; i--){
            int newPos = i + zeros;
            
            if(newPos < length){
                inventory[newPos] = inventory[i];
            }
            
            if(inventory[i] == 0){
                zeros--;
                
                if(i + zeros < length) {
                    inventory[i + zeros] = 0;
                }
                
            }
            
        }
        
    }
    
    public static void main(String[] args){
        int[] inventory1 = {4,0,1,3,0,2,5,0};
        duplicateZeroes(inventory1);
        //  Output: [4,0,0,1,3,0,0,2]
        
        System.out.println(Arrays.toString(inventory1));
        
        
        int[] inventory2 = {3,2,1};
        duplicateZeroes(inventory2);
        // Output: [3,2,1]
        
        System.out.println(Arrays.toString(inventory2));
        
        
        int[] inventory3 = {1, 0, 2, 0, 3, 0, 4, 0};
        
        //zeros -- 4
        // Output: 1, 0, 0, 2, 0, 0, 3, 0
        duplicateZeroes(inventory3);
        
        System.out.println(Arrays.toString(inventory3));

        
    }
    
    
    
}