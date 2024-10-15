package jpabook.jpashop.domain.item;

import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BookTest {

    @Autowired EntityManager em;

    @Test
    void 타입체크() {
        //given
        Book book = new Book();
        book.setName("book1");
        book.setPrice(10000);
        book.setStockQuantity(100);
        em.persist(book);
        em.flush();
        em.clear();

        //when
        Item item = em.find(Item.class, book.getId());

        //then
        assertThat(item.getClass()).isEqualTo(Book.class);
    }
}