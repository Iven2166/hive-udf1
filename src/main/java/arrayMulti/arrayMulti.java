package arrayMulti;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.List;
//import java.util.Arrays.asList;

import static java.util.Arrays.asList;


public class arrayMulti extends UDF{
    public double evaluate(List<Double> x, List<Double> y){
        double sum = 0.0;
        for(int i=0; i<x.size(); i++){
            sum = sum + x.get(i) * y.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        arrayDoubleSimCosine udf = new arrayDoubleSimCosine();
        List<Double> x = asList(2.0, 3.0, 5.0);
        List<Double> y = asList(1.0, 2.0, 4.0);
        double result = udf.evaluate(x, y);
        System.out.println(result);
    }
}
