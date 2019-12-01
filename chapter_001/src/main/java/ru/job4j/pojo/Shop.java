package ru.job4j.pojo;

/**
 * Класс демонстрирующий работу удаления элементов в массиве
 *
 * @author Денис Висков
 * @version 1.0
 * @since 01.12.2019
 */
public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        //удаляем значение из ячейки с индексом 1
        products[1] = null;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
        products[1] = products[2];
        //удаляем значение из ячейки с индексом 2.
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        Product[] product = new Shop().delete(products, 0);
    }

    /**
     * Метод осуществляет удаление элемента в массиве с заданным индексом и смещает все элементы влево
     *
     * @param products - продукты
     * @param index    - индекс
     * @return - массив с удалённым элементом
     */
    public Product[] delete(Product[] products, int index) {
        Product[] result = new Product[products.length];
        for (int i = 0; i < products.length; i++) {
            result[i] = products[i];
        }
        result[index] = null;
        for (int j = index; j < result.length - 1; j++) {
            result[j] = result[j + 1];
        }
        return result;
    }
}
