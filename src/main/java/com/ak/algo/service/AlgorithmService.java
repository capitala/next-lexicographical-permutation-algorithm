package com.ak.algo.service;

import org.springframework.stereotype.Service;

@Service
public class AlgorithmService {

    public String getLexographicallyNext(String input) {
        int length = input.length();
        int index = length - 1;
        char le = input.charAt(index);
        boolean flag = false;
        for (int i = length - 2; i >= 0; i--) {
            char e = input.charAt(i);
            if (e < le) {
                index = i ;
                flag = true;
                break;
            }
            le=e;
        }
        if (flag)
            return generateLexographicallyNext(input, index);
        else
            return "no answer";
    }

    private String generateLexographicallyNext(String input, int index) {
        char[] inputArray = input.toCharArray();
        char pivot = input.charAt(index);
        for (int i = input.length() - 1; i > index; i--) {
            if (inputArray[i] > pivot) {
                inputArray[index] = inputArray[i];
                inputArray[i] = pivot;
                break;
            }
        }
        reverseArray( inputArray, index+1);
        return new String(inputArray);
    }

    private void reverseArray(char[] arr, int startIndex) {
        for (int i = startIndex; i <= startIndex+(arr.length-startIndex)/ 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - (i-startIndex)-1];
            arr[arr.length - (i-startIndex)-1] = temp;
        }
    }

}
