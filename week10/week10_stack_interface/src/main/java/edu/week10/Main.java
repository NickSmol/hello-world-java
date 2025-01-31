package edu.week10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public interface Stack<T> {
        void push(T item);
        T pop();
        boolean isEmpty();
        T peek();
    }

    public static class StackImpl<T> implements Stack<T> {
        private ArrayList<T> stack;

        public StackImpl() {
            stack = new ArrayList<>();
        }

        @Override
        public void push(T item) {
            stack.add(item);
        }

        @Override
        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return stack.remove(stack.size() - 1);
        }

        @Override
        public boolean isEmpty() {
            return stack.isEmpty();
        }

        @Override
        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Stack is empty");
            }
            return stack.get(stack.size() - 1);
        }

        public void printStack() {
            if (isEmpty()) {
                System.out.println("Стек пуст.");
            } else {
                System.out.println("Содержимое стека: ");
                for (T item : stack) {
                    System.out.println(item);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип данных для стека:");
        System.out.println("1 - Целые числа");
        System.out.println("2 - Строки");
        System.out.println("3 - Числа с плавающей точкой");

        int choice = scanner.nextInt();
        scanner.nextLine();

        Stack<?> stack = null;

        switch (choice) {
            case 1:
                stack = new StackImpl<Integer>();
                break;
            case 2:
                stack = new StackImpl<String>();
                break;
            case 3:
                stack = new StackImpl<Double>();
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1 - Добавить элемент в стек");
            System.out.println("2 - Извлечь элемент из стека");
            System.out.println("3 - Показать верхний элемент стека");
            System.out.println("4 - Показать содержимое стека");
            System.out.println("5 - Выход");

            int action = scanner.nextInt();
            scanner.nextLine(); 

            switch (action) {
                case 1: {
                    System.out.println("Введите элемент для добавления в стек:");
                    String input = scanner.nextLine();
                    try {
                        if (stack instanceof StackImpl<?>) {
                            if (stack instanceof StackImpl<Integer>) {
                                ((StackImpl<Integer>) stack).push(Integer.parseInt(input));
                            } else if (stack instanceof StackImpl<String>) {
                                ((StackImpl<String>) stack).push(input);
                            } else if (stack instanceof StackImpl<Double>) {
                                ((StackImpl<Double>) stack).push(Double.parseDouble(input));
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат данных.");
                    }
                    break;
                }

                case 2: {
                    try {
                        if (stack instanceof StackImpl<?>) {
                            Object item = ((StackImpl<?>) stack).pop();
                            System.out.println("Извлеченный элемент: " + item);
                        }
                    } catch (IllegalStateException e) {
                        System.out.println("Стек пуст.");
                    }
                    break;
                }

                case 3: {
                    try {
                        if (stack instanceof StackImpl<?>) {
                            Object topElement = ((StackImpl<?>) stack).peek();
                            System.out.println("Верхний элемент стека: " + topElement);
                        }
                    } catch (IllegalStateException e) {
                        System.out.println("Стек пуст.");
                    }
                    break;
                }

                case 4: {
                    if (stack instanceof StackImpl<?>) {
                        ((StackImpl<?>) stack).printStack();
                    }
                    break;
                }

                case 5: {
                    System.out.println("Выход...");
                    scanner.close();
                    return;
                }

                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }
}
