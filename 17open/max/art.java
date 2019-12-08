//Max Yang
//Unfinished

import java.io.*;
import java.util.*;

public class art{
        public static void main(String[] args) throws IOException{
                Scanner scan = new Scanner(new File("art.in"));
                int N = scan.nextInt();
                int[] canvas = new int[N*N];
                int count=0, input=0;
                for(int i=0; i<N; i++){
                        input=scan.nextInt();
                        for(int j=0; j<N; j++){
                                canvas[i][j]= input;
                        }
                }
                int x=0;
                int[] num = new int[10];
                int xtr_max=0, ytr_min=10000, xbr_min=100000, ybr_max=0;                                                                                                                for(int i=0; i<N; i++){
                        for(int j=0; j<N; j++){
                                x = canvas[i][j];
                                if(x==1){                                                                                                                                                                       //Repeat for each other numbers to find top right and bottom left coordinates                                                                                           if(j<ytr_min) ytr_min = j;                                                                                                                                              if(j>ybr_max) ybr_max = j;                                                                                                                                              if(i<xbr_min) xbr_min = i;                                                                                                                                              if(i>xbr_max) xtr_max = i;                                                                                                                                      };                                                                                                                                                                      if(x==2 ;                                                                                                                                                               if(x==3) num[2]=1;
                                if(x==4) num[3]=1;
                                if(x==5) num[4]=1;
                                if(x==6) num[5]=1;
                                if(x==7) num[6]=1;
                                if(x==8) num[7]=1;
                                if(x==9) num[8]=1;
                        }
                }
                                                                                                                                                                        
                //for each area, check if another number interrupts it                                                                                                                  //if another number interrupts, that number is overlapping                                                                                                              //remaining numbers are answers                                                                                                                                 }
}