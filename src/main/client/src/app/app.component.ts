import {Component, ElementRef, ViewChild} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  @ViewChild('card') card: ElementRef;
  from : string = "BTC";
  to : string[] = ["USD", "GBP"];

  onKeyUpFrom(event) {
    
  }

  onKeyUpTo(event) {

  }
}
