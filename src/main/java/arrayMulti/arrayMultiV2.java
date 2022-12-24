package arrayMulti;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.List;
//import java.util.Arrays.asList;

import static java.util.Arrays.asList;

public class arrayMultiV2 extends UDF{
    public double evaluate(List<Double> x, List<Double> y){
        double sum = 0.0;
        for(int i=0; i<x.size(); i++){
            sum = sum + x.get(i) * y.get(i);
        }
        return sum;
    }

}