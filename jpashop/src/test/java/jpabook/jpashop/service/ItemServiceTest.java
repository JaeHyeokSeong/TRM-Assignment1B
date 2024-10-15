package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.exception.NotEnoughStockException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class ItemServiceTest {

    @Autowired
    ItemService itemService;

    @Test
    void 아이템_저장() {
        //given
        Book book = new Book();
        book.setName("book1");
        book.setName("name1");

        //when
        itemService.saveItem(book);
        Item findBook = itemService.findOne(book.getId());

        //then
        assertThat(findBook).isEqualTo(book);
    }

    @Test
    void 아이템_수량증가() {
        //given
        Book book = new Book();
        book.setName("book1");
        book.setName("name1");
        book.setStockQuantity(10);

        //when
        book.addStock(10);

        //then
        assertThat(book.getStockQuantity()).isEqualTo(20);
    }

    @Test
    void 아이템_수량감소() {
        //given
        Book book = new Book();
        book.setName("book1");
        book.setName("name1");
        book.setStockQuantity(10);

        //when
        book.removeStock(10);

        //then
        assertThat(book.getStockQuantity()).isEqualTo(0);
    }

    @Test
    void 아이템_수량감소_재고부족() {
        //given
        Book book = new Book();
        book.setName("book1");
        book.setName("name1");


        //when
        book.setStockQuantity(10);

        //then
        assertThatThrownBy(() -> book.removeStock(11))
                .isInstanceOf(NotEnoughStockException.class);
    }
}