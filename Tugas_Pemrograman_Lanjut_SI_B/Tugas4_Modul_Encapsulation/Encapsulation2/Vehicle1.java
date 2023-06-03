package Bab4;

public class Vehicle1
{
//jawaban no 3
//public double load, maxLoad;
//jawaban no 4
////protected double load, maxLoad;
double load, maxLoad; //jawaban no 5

public Vehicle1 (double max){
    this.maxLoad = max;
}
//jawaban no 1
public double getLoad(){
    return this.load;
}
public double getMaxLoad(){
    return this.maxLoad;
}
public boolean addBox(double weight){
    double temp = 0.0D;
    temp = this.load + weight;
    if(temp <= maxLoad){
        this.load = this.load + weight;
        return true;
    }
    else
    {
        return false;
        }
}
}
