package org.example;

/**
 * Класс List для хрения данных любого типа
 * @param <type> тип данных
 * @author Александр Пензенский
 */
public class List <type> {
    protected type d = null;
    protected List<type> next = null, p;
    /**
     * Функция для вставки эл-та в начало списка
     * @param data данные типа type
     */
    public void  insertHead(type data) {
        if (data == null) return;
        if (this.d != null) {
            p = new List<>();
            p.d = this.d;
            p.next = this.next;
            this.next = p;
        }
        this.d = data;
    }

    /**
     * Функция для вставки эл-та в конец списка
     * @param data данные типа type
     */
    public void insert(type data) {
        if (data == null) return;
        if (this.d == null)
            this.d = data;
        else {
            p = this;
            while (p.next != null)
                p = p.next;
            p.next = new List<>();
            p.next.d = data;
        }
    }

    /**
     * Функция извлечения самого первого эл-тф
     * @return значение самого первого эл-та
     */
    public type pop() {
        type data = this.d;
        if (this.next != null) {
            this.d = this.next.d;
            this.next = this.next.next;
        }
        else this.d = null;
        return data;
    }


    /**
     * Функция удаления из списка
     * @param data данные типа type
     * @return возвращает true or false
     */
    public boolean rem(type data) {
        if (data == null) return false;
        boolean found = false;
        if (this.d == data) {
            found = true;
            pop();
        }
        else {
            p = this;
            List<type> prev = p;
            while (!found && p.next != null) {
                found = p.next.d == data;
                prev = p;
                p = p.next;
            }
            if (found) {
                prev.next = p.next;
                p = new List<>();
                p = null;
            }
        }
        return found;
    }

}



