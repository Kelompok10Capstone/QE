package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.api.user.UpdateImage;

import java.io.IOException;

public class UpdateImageSteps {
    @Steps
    UpdateImage updateImage;
    @Given("I have endpoint auth for update image user")
    public void iHaveEndpointAuthForUpdateImageUser() { updateImage.iHaveEndpointAuthforUpdateImageUser();
    }

    @When("I send endpoint auth for update image and get token")
    public void iSendEndpointAuthForUpdateImageAndGetToken() { updateImage.iSendEndpointAuthforUpdateImageUserandGetToken();
    }

    @Then("I set update image api endpoint")
    public void iSetUpdateImageApiEndpoint() { updateImage.iSetUpdateImageAPIEndpoint();
    }

    @Then("I send upload image HTTP request with format valid")
    public void iSendUploadImageHTTPRequestWithFormatValid() throws IOException { updateImage.iSendUploadImageHTTPRequestwithFormatValid();
    }

    @And("I received valid HTTP response code {int} for update image")
    public void iReceivedValidHTTPResponseCodeForUpdateImage(int arg0) { updateImage.iReceivedValidHTTPResponseCodeforupdateimage();
    }

    @And("I received valid data for update image user")
    public void iReceivedValidDataForUpdateImageUser() { updateImage.iReceivedValidDataMessageSuccess();
    }
//===================================================================================================================
    @Then("I send upload image HTTP request with format invalid")
    public void iSendUploadImageHTTPRequestWithFormatInvalid() throws IOException { updateImage.iSendUploadImageHTTPRequestwithFormatInvalid();
    }

    @And("I received valid HTTP response code {int} bad request")
    public void iReceivedValidHTTPResponseCodeForUpdateImageBecauseFormatInvalid(int arg0) {
        updateImage.iReceivedValidHTTPResponseCodeforupdateimagebecauseformatinvalid();
    }

    @And("I received eror message : Uploaded image formats are only allowed png, jpg and jpeg")
    public void iReceivedErorMessageUploadedImageFormatsAreOnlyAllowedPngJpgAndJpeg() {
        updateImage.iReceivedValidDataMessageErorUploadedimageformatsareonlyallowedpngjpgandjpeg();
    }
//==========================================================================================================
    @When("I send upload image HTTP request with no authorization")
        public void iSendUploadImageHTTPRequestWithNoAuthorization() throws IOException { updateImage.iSendUploadImageHTTPRequestwithNoAuthorization();
        }
    @And("I received eror message : missing or malformed jwt")
    public void iReceivedErorMessageMissingOrMalformedJwt() { updateImage.iReceivedValidDataMessageErormissingormalformedjwt();
    }


}
