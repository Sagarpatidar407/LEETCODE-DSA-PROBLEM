// class Solution {
//     public void reverseString(char[] arr) {
        
//         int s = 0;
//         int e = arr.length-1;

//         while(s<e){
//             char temp = arr[s];
//             arr[s] = arr[e];
//             arr[e] = temp;
//             s++;
//             e--;
//         }

//     }
// }


class Solution {
    private void rev(char[] arr, int s, int e){

        if(s>=e){
            return;
        }

        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        rev(arr, s+1, e-1); 

    }

    public void reverseString(char[] arr) {
       
       rev(arr, 0, arr.length-1); 

    }
}