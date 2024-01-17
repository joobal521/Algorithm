class Solution {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();

        // 새로운 그림 파일의 크기 계산
        int newRows = rows * k;
        int newCols = cols * k;

        // 새로운 그림 파일 생성
        String[] newPicture = new String[newRows];

        // 각 행에 대해 k배 늘려서 복사
        for (int i = 0; i < rows; i++) {
            StringBuilder newRow = new StringBuilder();
            for (int j = 0; j < cols; j++) {
                char pixel = picture[i].charAt(j);
                for (int x = 0; x < k; x++) {
                    newRow.append(pixel);
                }
            }
            // k배 늘인 행을 새로운 그림 파일에 저장
            for (int x = 0; x < k; x++) {
                newPicture[i * k + x] = newRow.toString();
            }
        }

        return newPicture;
    }
}
