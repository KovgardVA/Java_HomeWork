import java.util.LinkedList;
import java.util.Queue;

public class Wave {
    public static void main(String[] args) {

    }

    // public static int[][] getMap() {
    // return new int[][] {
    // { -1, -1, -1, -1, -1, -1, -1, -1, -1 },
    // { -1, 00, 00, 00, -1, 00, 00, 00, -1 },
    // { -1, 00, 00, 00, -1, 00, 00, 00, -1 },
    // { -1, 00, 00, 00, 00, 00, -1, 00, -1 },
    // { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
    // { -1, 00, -1, 00, -1, 00, -1, 00, -1 },
    // { -1, 00, -1, 00, -1, 00, -1, 00, -1 },
    // { -1, 00, -1, 00, -1, -1, -1, 00, -1 },
    // { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
    // { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
    // { -1, 00, -1, 00, 00, 00, 00, 00, -1 },
    // { -1, 00, -1, -1, -1, 00, 00, 00, -1 },
    // { -1, 00, 00, 00, 00, 00, -1, 00, -1 },
    // { -1, 00, 00, 00, 00, 00, -1, 00, -1 },
    // { -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    // };
    // }

    // public static String mapToString(int[][] map) {
    // StringBuilder sb = new StringBuilder();

    // for (int row = 0; row < map.length; row++) {
    // for (int col = 0; col < map[row].length; col++) {
    // sb.append(String.format("%2d ", map[row][col]));
    // }
    // sb.append("\n");
    // }

    // return sb.toString();
    // }

    // public static int[] getPoint2D(int x, int y) {
    //     return new int[] { x, y };
    // }

    // public static void wave(int[][] map, int[] startPos) {

    //     Queue<int[]> queue = new LinkedList<int[]>();
    //     queue.add(startPos);
    //     map[startPos[0]][startPos[1]] = 1;

    //     while (queue.size() != 0) {
    //         int[] position = queue.remove();
    //         int posX = position[0];
    //         int posY = position[1];

    //         if (map[posX - 1][posY] == 0) {
    //             int[] temp = new int[] { posX - 1, posY };
    //             queue.add(temp);
    //             map[posX - 1][posY] = map[posX][posY] + 1;
    //         }
    //         if (map[posX][posY - 1] == 0) {
    //             int[] temp = new int[] { posX, posY - 1 };
    //             queue.add(temp);
    //             map[posX][posY - 1] = map[posX][posY] + 1;
    //         }
    //         if (map[posX + 1][posY] == 0) {
    //             int[] temp = new int[] { posX + 1, posY };
    //             queue.add(temp);
    //             map[posX + 1][posY] = map[posX][posY] + 1;
    //         }
    //         if (map[posX][posY + 1] == 0) {
    //             int[] temp = new int[] { posX, posY + 1 };
    //             queue.add(temp);
    //             map[posX][posY + 1] = map[posX][posY] + 1;
    //         }
    //     }
    // }
}

class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("x: %d y: %d", x, y);
    }
}

class MapGenerator {
    int[][] map;

    public MapGenerator() {
        int[][] map = {
            { -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 00, 00, 00, -1, 00, 00, 00, -1 },
            { -1, 00, 00, 00, -1, 00, 00, 00, -1 },
            { -1, 00, 00, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, 00, -1, 00, -1, 00, -1, 00, -1 },
            { -1, 00, -1, 00, -1, 00, -1, 00, -1 },
            { -1, 00, -1, 00, -1, -1, -1, 00, -1 },
            { -1, 00, -1, 00, 00, 00, -1, 00, -1 },
            { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
            { -1, 00, -1, 00, 00, 00, 00, 00, -1 },
            { -1, 00, -1, -1, -1, 00, 00, 00, -1 },
            { -1, 00, 00, 00, 00, 00, -1, 00, -1 },
            { -1, 00, 00, 00, 00, 00, -1, 00, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };

        this.map = map;
    }

    public int[][] getMap() {
        return map;
    }

    public void setStart(Point2D pos) {
        map[pos.x][pos.y] = 1;
    }

    public void setExit(Point2D pos) {
        map[pos.x][pos.y] = -5;
    }
}

class MapPrinter {
    public MapPrinter() {
    }
    
    public String mapToString(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                sb.append(String.format("%2d ", map[row][col]));
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}

class WaveAlgorithm {
    int[][] map;
    
    public WaveAlgorithm(int[][] map) {
        this.map = map;
    }

    public void waves(Point2D startPoint) {
        Queue<Point2D> queue = new LinkedList<Point2D>();
        queue.add(startPoint);
        map[startPoint.x][startPoint.y] = 1;

        while (queue.size() != 0) {
            Point2D pos = queue.remove();

            if (map[pos.x - 1][pos.y] == 0) {
                queue.add(new Point2D(pos.x - 1, pos.y));
                map[pos.x - 1][pos.y] = map[pos.x][pos.y] + 1;
            }
            if (map[pos.x][pos.y - 1] == 0) {
                queue.add(new Point2D(pos.x, pos.y - 1));
                map[pos.x][pos.y - 1] = map[pos.x][pos.y] + 1;
            }
            if (map[pos.x + 1][pos.y] == 0) {
                queue.add(new Point2D(pos.x + 1, pos.y));
                map[pos.x + 1][pos.y] = map[pos.x][pos.y] + 1;
            }
            if (map[pos.x][pos.y + 1] == 0) {
                queue.add(new Point2D(pos.x, pos.y + 1));
                map[pos.x][pos.y + 1] = map[pos.x][pos.y] + 1;
            }
        }
    }
}

// 1. Генератор карты getMap
// 2. Печать карты mapToString
// 3. Получение точки getPoint
// 4. Волновой алгоритм
// 4.1 Очередь в четырех направлениях
// 4.2 Заполнение пустых клеток