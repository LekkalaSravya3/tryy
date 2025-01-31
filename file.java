import java.io.*;

public class file {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            File file;
            String fileName;

            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Create a file");
                System.out.println("2. Read a file");
                System.out.println("3. Write to a file");
                System.out.println("4. Edit a file");
                System.out.println("5. Display contents of a file");
                System.out.println("6. Exit");

                int choice = Integer.parseInt(reader.readLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter file name to create:");
                        fileName = reader.readLine();
                        file = new File(fileName);

                        if (file.createNewFile()) {
                            System.out.println("File created successfully.");
                        } else {
                            System.out.println("File already exists.");
                        }
                        break;
                    case 2:
                        System.out.println("Enter file name to read:");
                        fileName = reader.readLine();
                        file = new File(fileName);
                        if (file.exists()) { 
                            BufferedReader fileReader = new BufferedReader(new FileReader(file));
                            String line;
                            while ((line = fileReader.readLine()) != null) {
                                System.out.println(line);
                            }
                            fileReader.close();
                        } else {
                            System.out.println("File does not exist.");
                        }
                        break;
                    case 3:
                        System.out.println("Enter file name to write:");
                        fileName = reader.readLine();
                        file = new File(fileName);

                        if (file.exists()) {
                            System.out.println("Enter content to write:");
                            String content = reader.readLine();
                            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true)); // Append mode
                            fileWriter.write(content);
                            fileWriter.newLine();
                            fileWriter.close();
                            System.out.println("Content written to file successfully.");
                        } else {
                            System.out.println("File does not exist.");
                        }
                        break;
                    case 4:
                        System.out.println("Enter file name to edit:");
                        fileName = reader.readLine();
                        file = new File(fileName);

                        if (file.exists()) {
                            System.out.println("Enter new content:");
                            String content = reader.readLine();
                            FileWriter fileWriter = new FileWriter(file);
                            fileWriter.write(content);
                            fileWriter.close();
                            System.out.println("File edited successfully.");
                        } else {
                            System.out.println("File does not exist.");
                        }
                        break;
                    case 5:
                        System.out.println("Enter file name to display contents:");
                        fileName = reader.readLine();
                        file = new File(fileName);

                        if (file.exists()) {
                            BufferedReader fileReader = new BufferedReader(new FileReader(file));
                            String line;
                            while ((line = fileReader.readLine()) != null) {
                                System.out.println(line);
                            }
                            fileReader.close();
                        } else {
                            System.out.println("File does not exist.");
                        }
                        break;
                    case 6:
                        System.out.println("Exiting program.");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}