package Figuras.Lado;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Punto{
   private int x;
   private int y;

   public Punto(int x, int y){
       this.x = x;
       this.y = y;
   }
}
