package cn.hive;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class MyUDF extends UDF {
 public Text evaluate(final  Text line){
   if (line.toString() != null && !line.toString().equals("")){
    String s = line.toString().substring(0, 1).toUpperCase() + line.toString().substring(1);
    return new Text(s);
   }
   return  new Text("");
 }
}
