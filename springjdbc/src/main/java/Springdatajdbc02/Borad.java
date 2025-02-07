package Springdatajdbc02;

import java.util.List;

public class Borad {
    String title;
    String content;

    List<Reply> replies;
}


//BoardList  -- >  Borard  -->
/*
 public Map<Integer, User> extractData(ResultSet rs) throws SQLException {
        Map<Integer, User> userMap = new HashMap<>();

        while (rs.next()) {
            int userId = rs.getInt("user_id");

            // 이미 존재하는 User 객체인지 확인
            User user = userMap.get(userId);
            if (user == null) {
                user = new User(userId, rs.getString("name"), new ArrayList<>());
                userMap.put(userId, user);
            }

            // Post 추가
            Post post = new Post(rs.getInt("post_id"), rs.getString("title"));
            user.getPosts().add(post);
        }
        return userMap;
    }
 */