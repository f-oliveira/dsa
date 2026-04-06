package exercises.arrays_strings;

public class RotateMatrix {
  /**
    Rotate Matrix: Given an image represented by an NxN matrix, 
    where each pixel in the image is 4
    bytes, write a method to rotate the image by 90 degrees. 
    Can you do this in place?
    
    Hints: #51, # 100
  */
  public int[][] solution(int[][] image){
    int rows = image.length;
    int temp = 0;

    int size = image.length / 2;

    for(int i = 0; i < size; i++){
      int first = i;
      int last = rows - 1 - i;
      for(int j = first; j < last; j++) {
        int offset = j - first;
        
        int top = image[first][j];

        image[first][i] = image[last - offset][first];

        
      }
      rows--;
      
    }
    
    return image;
  }
}