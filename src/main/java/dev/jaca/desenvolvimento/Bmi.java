package dev.jaca.desenvolvimento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bmi {
    private float weight;
    private float height;
    //body mass index
    private float bmi; 
    

    private float calculateBmi() {;
        return this.bmi = this.weight / (this.height * this.height);
    }

    private String getBmiCategory(float bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Ideal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Slightly overweight";
        } else if(bmi >= 30 && bmi < 35) {
            return "Obesity Grade I";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obesity Grade II(Severe)";
        }else if(bmi >= 40){
            return "Obesity Grade III(Morbid)";
        }else{
            return "Unknown category";
        }
    }

    private String getBmiInfo() {
        return String.format("Your BMI is: %.2f - %s", this.bmi, getBmiCategory(this.bmi));
    }
    
    public void imputData(float weight, float height) {
        this.weight = weight;
        this.height = height;
        calculateBmi();
        System.out.println(getBmiInfo());
    }
}