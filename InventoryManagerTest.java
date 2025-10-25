import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class InventoryManagerTest {
    // 3 normal test cases
    //  Output: [4,0,0,1,3,0,0,2]
    
    @Test
    public void testNormalCase1(){
        int[] inventory = {4,0,1,3,0,2,5,0};
        int[] expected = {4,0,0,1,3,0,0,2};
        InventoryManager.duplicateZeroes(inventory);
        assertArrayEquals(expected, inventory);
    }
    
    @Test
    public void testNormalCase2(){
        int[] inventory = {3,2,1};
        int[] expected = {3,2,1};
        InventoryManager.duplicateZeroes(inventory);
        assertArrayEquals(expected, inventory);
    }
    
    @Test
    public void testNormalCase3(){
        int[] inventory = {1, 0, 2, 0, 3, 0, 4, 0};
        int[] expected = {1, 0, 0, 2, 0, 0, 3, 0};
        InventoryManager.duplicateZeroes(inventory);
        assertArrayEquals(expected, inventory);
    }    
    
    // 3 edge test cases
    @Test
    public void testEmptyArray(){
        int[] inventory = {};
        int[] expected = {};
        InventoryManager.duplicateZeroes(inventory);
        assertArrayEquals(expected, inventory);
    }
    
    @Test
    public void testAllZeroes(){
        int[] inventory = {0,0,0,0,0};
        int[] expected = {0,0,0,0,0};
        InventoryManager.duplicateZeroes(inventory);
        assertArrayEquals(expected, inventory);
    }
    
    @Test
    public void testZeroesAtEnd(){
        int[] inventory = {1, 2, 3, 0};
        int[] expected = {1, 2, 3, 0};
        InventoryManager.duplicateZeroes(inventory);
        assertArrayEquals(expected, inventory);
        
    }
    
    }

