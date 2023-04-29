package Validation.In.UMS.demo.Service;

import Validation.In.UMS.demo.Model.validationModel;
import Validation.In.UMS.demo.Repository.validationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class validationService
{
    @Autowired
    validationRepository dao;

    public static List<validationModel> getAllData() {
        return validationRepository.getAllData();
    }

    public static validationModel getDataById(int UserId) {
        return validationRepository.getAllDataById(UserId);
    }

    public static validationModel delete(int UserId) {
        return validationRepository.delete(UserId);
    }

    public void addName(validationModel model) {
        validationRepository.addName(model);

    }

    public static validationModel update(int UserId, validationModel model) {
        return validationRepository.upadate(UserId,model);
    }
}
