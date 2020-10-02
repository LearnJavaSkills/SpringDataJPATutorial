package in.learnjavaskills.springdataJPAtutorila.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.learnjavaskills.springdataJPAtutorila.dto.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {}
