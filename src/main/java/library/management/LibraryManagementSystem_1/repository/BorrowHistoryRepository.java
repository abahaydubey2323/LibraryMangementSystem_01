package library.management.LibraryManagementSystem_1.repository;





//package library.management.LibraryManagementSystem_1.repository;

//public interface BorrowHistory package com.library.repository;

//import com.library.entity.BorrowHistory;
//import com.library.entity.Book;
//import com.library.entity.User;
//import com.library.enums.BorrowStatus;
import library.management.LibraryManagementSystem_1.entity.Book;
import library.management.LibraryManagementSystem_1.entity.BorrowHistory;
import library.management.LibraryManagementSystem_1.entity.User;
import library.management.LibraryManagementSystem_1.enums.BorrowStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BorrowHistoryRepository extends JpaRepository<BorrowHistory, Long> {

    List<BorrowHistory> findByUser(User user);

    List<BorrowHistory> findByBook(Book book);

    List<BorrowHistory> findByStatus(BorrowStatus status);

    List<BorrowHistory> findByUserAndStatus(User user,
                                            BorrowStatus status);

}