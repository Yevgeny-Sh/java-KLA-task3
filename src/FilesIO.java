import java.io.*;

public class FilesIO {

    public static void writeFile(String fileName, String content) {
        BufferedWriter writer;
        {
            try {
                writer = new BufferedWriter(new FileWriter(fileName));
                writer.write(content);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readFile(String fileName) {
        BufferedReader reader;
        {
            try {
                reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();;
            }
        }
    }

    public static void processContents(String fileName) {
        BufferedReader reader;
        {
            try {
                reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    String upperCaseLine = line.toUpperCase();
                    // FilesIO.writeFile(fileName,upperCaseLine);
                    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                    writer.newLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void convertFileToUpperCase(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line.toUpperCase());
                content.append(System.lineSeparator());
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
                bw.write(content.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
