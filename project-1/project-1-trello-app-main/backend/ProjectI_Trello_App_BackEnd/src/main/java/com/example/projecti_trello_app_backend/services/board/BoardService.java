package com.example.projecti_trello_app_backend.services.board;

import com.example.projecti_trello_app_backend.dto.BoardDTO;
import com.example.projecti_trello_app_backend.entities.board.Board;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BoardService {

    List<Board> findAll();

    Optional<Board> findByBoardId(int boardId);

    List<Board> findByWorkspace(int workspaceId);

    Optional<Board> addBoard (Board board);

    Optional<Board> update (BoardDTO boardDTO);

    boolean delete(int boardId);

    boolean deleteByWorkspace(int workspaceId);
}
