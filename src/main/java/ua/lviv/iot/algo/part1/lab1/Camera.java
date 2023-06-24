package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Camera {
    private String model; // Camera model
    private String brand; // Camera brand
    private String lens;  // Camera lens
    public abstract String takePhoto();  // Take photo
}
