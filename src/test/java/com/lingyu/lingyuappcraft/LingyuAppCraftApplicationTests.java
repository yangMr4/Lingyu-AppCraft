package com.lingyu.lingyuappcraft;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LingyuAppCraftApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private DataSource dataSource;

    @Test
    void testDatabaseConnection() throws Exception {
        assertNotNull(dataSource, "数据源不能为空");
        try (Connection connection = dataSource.getConnection()) {
            assertNotNull(connection, "数据库连接不能为空");
            assertTrue(connection.isValid(5), "数据库连接无效");

            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT 1")) {
                assertTrue(rs.next(), "查询无返回结果");
                System.out.println("数据库连接成功！查询结果: " + rs.getInt(1));
            }
        }
    }
}
