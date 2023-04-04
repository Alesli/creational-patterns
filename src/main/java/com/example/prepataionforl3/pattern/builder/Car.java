package com.example.prepataionforl3.pattern.builder;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Car {
    private int id;
    private String model;
    private int wheels;
    private int maxSpeed;

    public static class Builder {
        Car car = new Car();

        public Builder setId(int id) {
            car.id = id;
            return this;
        }

        public Builder setModel(String model) {
            car.model = model;
            return this;
        }

        public Builder setWheels(int wheels) {
            car.wheels = wheels;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            car.maxSpeed = maxSpeed;
            return this;
        }

        public Car build() {
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", wheels=" + wheels +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

