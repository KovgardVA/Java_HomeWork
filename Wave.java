public class Wave {
    public static void main(String[] args) {
        int[][] map = getMap();
        System.out.println(mapToString(map));
        int[] startPoint = getPoint2D(9, 2);
    }

    public static int[][] getMap() {
        return new int[][] {
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
    }

    public static String mapToString(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                sb.append(String.format("%2d ", map[row][col]));
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static int[] getPoint2D(int x, int y) {
        return new int[] { x, y };
    }
}

// 1. Генератор карты getMap
// 2. Печать карты mapToString
// 3. Получение точки getPoint
// 4. Волновой алгоритм
// 4.1 Очередь в четырех направлениях
// 4.2 Заполнение пустых клеток