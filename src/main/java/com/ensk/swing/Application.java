package com.ensk.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class Application {

    /**
     * Start Learning Vocabulary
     *
     * @author tojohnonly
     * @date 2023/07/01 15:26
     * @version 1.0.0
     */
    public static void main(String[] args) {
        JFrame frame = FrameContainer.assembleFrame();
        frame.setVisible(true);
    }

}