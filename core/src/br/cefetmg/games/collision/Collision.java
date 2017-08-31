package br.cefetmg.games.collision;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Utilitário para verificação de colisão.
 *
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class Collision {

    /**
     * Verifica se dois círculos em 2D estão colidindo.
     * @param c1 círculo 1
     * @param c2 círculo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean circlesOverlap(Circle c1, Circle c2) {
        Vector2 circle1 = new Vector2(c1.x, c1.y);
        Vector2 circle2 = new Vector2(c2.x, c2.y);
        return circle1.dst(circle2) < (c1.radius + c2.radius);
    }

    /**
     * Verifica se dois retângulos em 2D estão colidindo.
     * Esta função pode verificar se o eixo X dos dois objetos está colidindo
     * e então se o mesmo ocorre com o eixo Y.
     * @param r1 retângulo 1
     * @param r2 retângulo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean rectsOverlap(Rectangle r1, Rectangle r2) {
        Vector2 rect1 = new Vector2(r1.x, r1.y);
        Vector2 rect2 = new Vector2(r2.x, r2.y);
        float rect1YMax = rect1.y + r1.height;
        float rect1XMax = rect1.x + r1.width;
        float rect2YMax = rect2.y + r2.height;
        float rect2XMax = rect2.x + r2.width;
        
        return rect1YMax >= rect2.y &&
               rect1.y <= rect2YMax &&
               rect1XMax >= rect2.x &&
               rect1.x <= rect2XMax;
    }
}
