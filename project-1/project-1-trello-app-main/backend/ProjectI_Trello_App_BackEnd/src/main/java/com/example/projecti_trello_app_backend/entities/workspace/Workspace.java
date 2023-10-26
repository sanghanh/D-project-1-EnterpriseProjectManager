package com.example.projecti_trello_app_backend.entities.workspace;

import com.example.projecti_trello_app_backend.entities.board.Board;
import com.example.projecti_trello_app_backend.entities.user.User;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "${database.name}",name = "work_space")
public class Workspace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_space_id",unique = true,nullable = false)
    private int workspaceId;

    @Column(name = "work_space_title")
    @NotNull
    private String workspaceTitle;

    @Column(name = "work_space_type")
    private String workspaceType;

    @Column(name = "visibility")
    private String visibility;

    @Column(name ="work_space_description")
    private String workspaceDescription;

    @Column(name = "deleted")
    private boolean deleted;


}
