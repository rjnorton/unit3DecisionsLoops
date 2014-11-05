import java.util.Scanner;

public class Spectrum
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a wavelength: ");
        double wavelen = s.nextDouble();
        
        if (wavelen >= 1e-1)
        {
            System.out.println("Radio wave");
            System.out.println("Wavelength(m) > 1e-1");
            System.out.println("Frequency(Hz) < 3e9");
        }
        
        else if (wavelen < 1e-1 && wavelen >= 1e-3)
        {
            System.out.println("Microwave");
            System.out.println("Wavelength(m) 1e-1 to 1e-3");
            System.out.println("Frequency(Hz) 3e9 to 3e11");
        }

        else if (wavelen < 1e-3 && wavelen >= 7e-7)
        {
            System.out.println("Infrared wave");
            System.out.println("Wavelength(m) 1e-3 to 7e-7");
            System.out.println("Frequency(Hz) 3e11 to 4e14");
        }
        
        else if (wavelen < 7e-7 && wavelen >= 4e-7)
        {
            System.out.println("Visible light");
            System.out.println("Wavelength(m) 7e-7 to 4e-7");
            System.out.println("Frequency(Hz) 4e14 to 7.5e14");
        }
        
        else if (wavelen < 4e-7 && wavelen >= 1e-8)
        {
            System.out.println("Ultraviolet wave");
            System.out.println("Wavelength(m) 4e-7 to 1e-8");
            System.out.println("Frequency(Hz) 7.5e14 to 3e16");
        }
        
        else if (wavelen < 1e-8 && wavelen >= 1e-11)
        {
            System.out.println("X-ray wave");
            System.out.println("Wavelength(m) 1e-8 to 1e-11");
            System.out.println("Frequency(Hz) 3e16 to 3e19");
        }
        
        else
        {
            System.out.println("Gamma ray");
            System.out.println("Wavelength(m) < 1e-11");
            System.out.println("Frequency(Hz) > 3e19");
        }
    }
}
